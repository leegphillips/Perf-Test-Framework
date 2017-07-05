package com.wiggle.perf.controller;

import com.wiggle.perf.PerfApplication;
import com.wiggle.perf.model.OrderFactory;
import com.wiggle.perf.model.PerfTest;
import com.wiggle.perf.repository.PerfTestRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.restdocs.payload.FieldDescriptor;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.JsonFieldType.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PerfApplication.class})
public class WebControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private PerfTestRepository perfTestRepository;

    @Value(value = "classpath:Braintree.json")
    private Resource braintree;

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

    private MockMvc mockMvc;

    private PerfTest perfTest;

    private FieldDescriptor[] testRootProjection = new FieldDescriptor[]{
        fieldWithPath("testId").type(NUMBER).description("Test identifier"),
    };

    private FieldDescriptor[] testLinkProjection = new FieldDescriptor[]{
        fieldWithPath("links[].rel").type(STRING).description("Links rel"),
        fieldWithPath("links[].href").type(STRING).description("Links url")
    };

    private FieldDescriptor[] testOrderProjection = new FieldDescriptor[]{
        fieldWithPath("originalOrderId").type(VARIES).description("Original order id"),
        fieldWithPath("source").type(STRING).description("Source"),
        fieldWithPath("timeStamp").type(STRING).description("Timestamp"),
        fieldWithPath("customerViewingCurrency").type(STRING).description("Timestamp"),
        fieldWithPath("orderCurrency").type(STRING).description("Order currency"),
        fieldWithPath("exchangeRate").type(NUMBER).description("Exchange rate"),
        fieldWithPath("orderAmount").type(NUMBER).description("Order amount"),
        fieldWithPath("orderDiscount").type(NUMBER).description("Order discount"),
        fieldWithPath("promotionList").type(ARRAY).description("Promotion list"),
        fieldWithPath("orderId").type(STRING).description("Order identifier"),
        fieldWithPath("links").type(ARRAY).description("Order Links"),
    };

    private FieldDescriptor[] testOrderCustomerProjection = new FieldDescriptor[]{
        fieldWithPath("customer.id").type(STRING).description("Customer identifier"),
        fieldWithPath("customer.contactNumber").type(STRING).description("Customer contact number"),
        fieldWithPath("customer.emailAddress").type(STRING).description("Customer email address")
    };

    private FieldDescriptor[] testOrderBillingAddressProjection = new FieldDescriptor[]{
        fieldWithPath("billingAddress.firstName").type(STRING).description("Billing address first name"),
        fieldWithPath("billingAddress.surname").type(STRING).description("Billing address sure name"),
        fieldWithPath("billingAddress.addressLine1").type(STRING).description("Billing address line 1"),
        fieldWithPath("billingAddress.addressLine2").type(VARIES).description("Billing address line 2"),
        fieldWithPath("billingAddress.city").type(STRING).description("Billing city"),
        fieldWithPath("billingAddress.county").type(STRING).description("Billing address county"),
        fieldWithPath("billingAddress.country").type(STRING).description("Billing address country"),
        fieldWithPath("billingAddress.postCode").type(STRING).description("Billing address postcode")
    };

    private FieldDescriptor[] testOrderShippingAddressProjection = new FieldDescriptor[]{
        fieldWithPath("shippingAddress.collectionPointId").type(VARIES).description("Shipping address collection point identifier"),
        fieldWithPath("shippingAddress.mobileNumber").type(STRING).description("Shipping address mobile number"),
        fieldWithPath("shippingAddress.firstName").type(STRING).description("Shipping address first name"),
        fieldWithPath("shippingAddress.surname").type(STRING).description("Shipping address sure name"),
        fieldWithPath("shippingAddress.addressLine1").type(STRING).description("Shipping address line 1"),
        fieldWithPath("shippingAddress.addressLine2").type(STRING).description("Shipping address line 2"),
        fieldWithPath("shippingAddress.city").type(STRING).description("Shipping address city"),
        fieldWithPath("shippingAddress.county").type(STRING).description("Shipping address county"),
        fieldWithPath("shippingAddress.country").type(STRING).description("Shipping address country"),
        fieldWithPath("shippingAddress.postCode").type(STRING).description("Shipping address postal code")
    };

    private FieldDescriptor[] testOrderShippingProjection = new FieldDescriptor[]{
        fieldWithPath("shipping.cost").type(NUMBER).description("Shipping cost"),
        fieldWithPath("shipping.method").type(STRING).description("Shipping method"),
        fieldWithPath("shipping.dutyPaid").type(NUMBER).description("Shipping duty paid"),
        fieldWithPath("shipping.shippingSLA").type(STRING).description("Shipping SLA"),
        fieldWithPath("shipping.collectionProvider").type(STRING).description("Shipping collection provider"),
        fieldWithPath("shipping.collectionService").type(STRING).description("Shipping collection service")
    };

    private FieldDescriptor[] testOrderPaymentDetailProjection = new FieldDescriptor[]{
        fieldWithPath("paymentDetails[].creditCard").type(VARIES).description("Payment detail credit card"),
        fieldWithPath("paymentDetails[].bankTransfer").type(VARIES).description("Payment detail bank transfer"),
        fieldWithPath("paymentDetails[].payPal").type(VARIES).description("Payment detail paypal"),
        fieldWithPath("paymentDetails[].giftCertificates").type(ARRAY).description("Payment detail gift certificates"),
        fieldWithPath("paymentDetails[].braintree.transaction.id").type(STRING).description("Payment detail brain tree transaction id"),
        fieldWithPath("paymentDetails[].braintree.transaction.paymentAmount").type(NUMBER).description("Payment detail brain tree transaction payment amount"),
        fieldWithPath("paymentDetails[].braintree.transaction.currency").type(STRING).description("Payment detail brain tree transaction currency"),
        fieldWithPath("paymentDetails[].braintree.transaction.merchantAccountId").type(STRING).description("Payment detail brain tree transaction merchant account id"),
        fieldWithPath("paymentDetails[].braintree.transaction.status").type(STRING).description("Payment detail brain tree credit card transaction status"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.token").type(STRING).description("Payment detail brain tree card token"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.cardType").type(STRING).description("Payment detail brain tree card type"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.cardHolderName").type(STRING).description("Payment detail brain tree card holder name"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.maskedNumber").type(STRING).description("Payment detail brain tree card masked number"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.countryOfIssuance").type(STRING).description("Payment detail brain tree card country of issuance"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.issuingBank").type(STRING).description("Payment detail brain tree card issuing bank"),
        fieldWithPath("paymentDetails[].braintree.braintreeCard.createdAtTimestamp").type(STRING).description("Payment detail brain tree card created at timestamp"),
        fieldWithPath("paymentDetails[].braintree.braintreeFraudIndicators.cvvResponseCode").type(STRING).description("Payment detail brain tree fraud indicator cvv response code"),
        fieldWithPath("paymentDetails[].braintree.braintreeFraudIndicators.avsStreetAddressResponseCode").type(STRING).description("Payment detail brain tree fraud indicator avs street address response code"),
        fieldWithPath("paymentDetails[].braintree.braintreeFraudIndicators.avsPostalCodeResponseCode").type(STRING).description("Payment detail brain tree fraud indicator avs postal code response code"),
        fieldWithPath("paymentDetails[].braintree.braintreeFraudIndicators.avsErrorResponseCode").type(STRING).description("Payment detail brain tree fraud indicator avs error response code"),
        fieldWithPath("paymentDetails[].finance").type(VARIES).description("Payment detail finance"),
        fieldWithPath("paymentDetails[].cycleScheme").type(VARIES).description("Payment detail cycle scheme"),
        fieldWithPath("paymentDetails[].freeOfCharge").type(VARIES).description("Payment detail free of charge"),
        fieldWithPath("paymentDetails[].onAccount").type(VARIES).description("Payment detail on account"),
        fieldWithPath("paymentDetails[].chequeCashDraft").type(VARIES).description("Payment detail cheque cash draft")
    };

    private FieldDescriptor[] testOrderItemProjection = new FieldDescriptor[]{
        fieldWithPath("items[].referenceSKU").type(STRING).description("Item reference SKU"),
        fieldWithPath("items[].status").type(STRING).description("Item status"),
        fieldWithPath("items[].itemPromotions").type(ARRAY).description("Item promotion"),
        fieldWithPath("items[].isKit").type(STRING).description("Item is kit"),
        fieldWithPath("items[].kitType").type(VARIES).description("Item kit type"),
        fieldWithPath("items[].kitItems").type(ARRAY).description("Item kit items"),
        fieldWithPath("items[].referenceLineId").type(STRING).description("Item reference line identifier"),
        fieldWithPath("items[].groupStockId").type(STRING).description("Item group stock identifier"),
        fieldWithPath("items[].quantity").type(NUMBER).description("Item quantity"),
        fieldWithPath("items[].unitPrice").type(NUMBER).description("Item unit price"),
        fieldWithPath("items[].totalPrice").type(NUMBER).description("Item total price"),
        fieldWithPath("items[].priceBeforeDiscount").type(NUMBER).description("Item price before discount"),
        fieldWithPath("items[].unitCostExVAT").type(NUMBER).description("Item unit cost exclude VAT"),
        fieldWithPath("items[].countryVATRate").type(NUMBER).description("Item country VAT rate"),
        fieldWithPath("items[].unitVATAmt").type(NUMBER).description("Item unit VAT amount"),
        fieldWithPath("items[].totalItemCostExVAT").type(NUMBER).description("Item total cost exclude VAT"),
        fieldWithPath("items[].totalItemVAT").type(NUMBER).description("Item total VAT")
    };

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(webApplicationContext)
                .apply(documentationConfiguration(this.restDocumentation).uris()
                        .withScheme("http")
                        .withHost("localhost")
                        .withPort(8080))
                .build();

        perfTest = new PerfTest();
        perfTest.addOrder(new OrderFactory().create(braintree));
        perfTestRepository.save(perfTest);
    }

    @After
    public void cleanUp() throws Exception{
        perfTestRepository.deleteAll();
    }

    @Test
    public void test() throws Exception{
        mockMvc.perform(RestDocumentationRequestBuilders.get("/test"))
                .andExpect(status().isOk())
                .andDo(document("test-get-all",
                    preprocessResponse(prettyPrint()),
                    responseFields()
                        .andWithPrefix("[].", testRootProjection)
                        .andWithPrefix("[].", testLinkProjection)
                        .andWithPrefix("[].orders[].", testOrderProjection)
                        .andWithPrefix("[].orders[].", testOrderCustomerProjection)
                        .andWithPrefix("[].orders[].", testOrderBillingAddressProjection)
                        .andWithPrefix("[].orders[].", testOrderShippingAddressProjection)
                        .andWithPrefix("[].orders[].", testOrderShippingProjection)
                        .andWithPrefix("[].orders[].", testOrderPaymentDetailProjection)
                        .andWithPrefix("[].orders[].", testOrderItemProjection)
                ));
    }

    @Test
    public void getOne() throws Exception{
        mockMvc.perform(RestDocumentationRequestBuilders.get("/test/" + perfTest.getTestId()))
                .andExpect(status().isOk())
                .andDo(document("test-get-one",
                    preprocessResponse(prettyPrint()),
                    responseFields(testRootProjection)
                        .and(testLinkProjection)
                        .andWithPrefix("orders[].", testOrderProjection)
                        .andWithPrefix("orders[].", testOrderCustomerProjection)
                        .andWithPrefix("orders[].", testOrderBillingAddressProjection)
                        .andWithPrefix("orders[].", testOrderShippingAddressProjection)
                        .andWithPrefix("orders[].", testOrderShippingProjection)
                        .andWithPrefix("orders[].", testOrderPaymentDetailProjection)
                        .andWithPrefix("orders[].", testOrderItemProjection)
                ));
    }

    @Test
    public void testCreate() throws Exception{
        mockMvc.perform(RestDocumentationRequestBuilders.post("/create").param("count","1"))
                .andExpect(status().is3xxRedirection());
        Assert.assertEquals(2, perfTestRepository.findAll().size());
    }

    @Test
    public void testOrderDetail() throws Exception{
        mockMvc.perform(RestDocumentationRequestBuilders.get("/order/" + perfTest.getOrders().get(0).getOriginalOrderId()))
                .andExpect(status().isOk())
                .andDo(document("order-get-one",
                    preprocessResponse(prettyPrint()),
                    responseFields(testOrderProjection)
                        .and(testLinkProjection)
                        .and(testOrderCustomerProjection)
                        .and(testOrderBillingAddressProjection)
                        .and(testOrderShippingAddressProjection)
                        .and(testOrderShippingProjection)
                        .and(testOrderPaymentDetailProjection)
                        .and(testOrderItemProjection)
                ));
    }

    @Test
    public void testOrderEvents() throws Exception{
        mockMvc.perform(RestDocumentationRequestBuilders.get("/order/" + perfTest.getOrders().get(0).getOriginalOrderId() + "/events"))
                .andExpect(status().isOk());
    }
}
/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

    private static String id;

    public static void main(String[] args) {

        /**
         * HashSet exercise
         */
        File file01 = new File("/Users/oleg/AccessCode/JavaPrograms/BootCampHW/Resources/taleoftwocities.txt");
        Set<String> talesSet = new HashSet<>();
        try {
            Scanner scanner = new Scanner(file01);
            while (scanner.hasNext()) {
                talesSet.add(scanner.next().trim().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file02 = new File("/Users/oleg/AccessCode/JavaPrograms/BootCampHW/Resources/mobydick.txt");
        Set<String> mobySet = new HashSet<>();
        try {
            Scanner scanner = new Scanner(file02);
            while (scanner.hasNext()) {
                mobySet.add(scanner.next().trim().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(talesSet.size());
        System.out.println(mobySet.size());

        Set<String> intersection = new HashSet<>(talesSet);
        intersection.retainAll(mobySet);
        System.out.println(intersection.size());

        Set<String> union = new HashSet<>(talesSet);
        union.addAll(mobySet);
        System.out.println(union.size());

        for (String s : union) {
            System.out.println(s);
        }

    }

    /**
     * Stripe API exercise
     * question 1
     */
    private static void getAllCustomerEmail() {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
        Map<String, Object> customerParams = new HashMap<>();
        try {
            Iterable<Customer> itCustomers = Customer.list(customerParams).autoPagingIterable();
            for (Customer customer : itCustomers) {
                System.out.println(customer.getEmail());
            }
            List<Customer> customers = Customer.list(customerParams).getData();
            System.out.println(customers.size());
        } catch (CardException e) {
            // Since it's a decline, CardException will be caught
            System.out.println("Status is: " + e.getCode());
            System.out.println("Message is: " + e.getMessage());
        } catch (RateLimitException e) {
            // Too many requests made to the API too quickly
        } catch (InvalidRequestException e) {
            // Invalid parameters were supplied to Stripe's API
        } catch (AuthenticationException e) {
            // Authentication with Stripe's API failed
            // (maybe you changed API keys recently)
        } catch (APIConnectionException e) {
            // Network communication with Stripe failed
        } catch (StripeException e) {
            // Display a very generic error to the user, and maybe send
            // yourself an email
        } catch (Exception e) {
            // Something else happened, completely unrelated to Stripe
        }
    }

    /**
     * question 2
     */
    private static void getNumberOfCustomer() {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
        Map<String, Object> customerParams = new HashMap<>();
        try {
            List<Customer> customers = Customer.list(customerParams).getData();
            System.out.println(customers.size());
        } catch (CardException e) {
            // Since it's a decline, CardException will be caught
            System.out.println("Status is: " + e.getCode());
            System.out.println("Message is: " + e.getMessage());
        } catch (RateLimitException e) {
            // Too many requests made to the API too quickly
        } catch (InvalidRequestException e) {
            // Invalid parameters were supplied to Stripe's API
        } catch (AuthenticationException e) {
            // Authentication with Stripe's API failed
            // (maybe you changed API keys recently)
        } catch (APIConnectionException e) {
            // Network communication with Stripe failed
        } catch (StripeException e) {
            // Display a very generic error to the user, and maybe send
            // yourself an email
        } catch (Exception e) {
            // Something else happened, completely unrelated to Stripe
        }
    }

    /**
     * question 3
     */
    private static void createCharge() {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("amount", 2000);
        chargeParams.put("currency", "usd");
        chargeParams.put("description", "Charge");
        chargeParams.put("source", "tok_visa");
        try {
            id = Charge.create(chargeParams).getId();
            System.out.println(Charge.retrieve(id));
        } catch (CardException e) {
            // Since it's a decline, CardException will be caught
            System.out.println("Status is: " + e.getCode());
            System.out.println("Message is: " + e.getMessage());
        } catch (RateLimitException e) {
            // Too many requests made to the API too quickly
        } catch (InvalidRequestException e) {
            // Invalid parameters were supplied to Stripe's API
        } catch (AuthenticationException e) {
            // Authentication with Stripe's API failed
            // (maybe you changed API keys recently)
        } catch (APIConnectionException e) {
            // Network communication with Stripe failed
        } catch (StripeException e) {
            // Display a very generic error to the user, and maybe send
            // yourself an email
        } catch (Exception e) {
            // Something else happened, completely unrelated to Stripe
        }
    }

    /**
     * question 4
     */
    private static void submitRefund() {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
        Map<String, Object> refundParams = new HashMap<String, Object>();
        refundParams.put("charge", id);
        try {
            Refund.create(refundParams);
        } catch (CardException e) {
            // Since it's a decline, CardException will be caught
            System.out.println("Status is: " + e.getCode());
            System.out.println("Message is: " + e.getMessage());
        } catch (RateLimitException e) {
            // Too many requests made to the API too quickly
        } catch (InvalidRequestException e) {
            // Invalid parameters were supplied to Stripe's API
        } catch (AuthenticationException e) {
            // Authentication with Stripe's API failed
            // (maybe you changed API keys recently)
        } catch (APIConnectionException e) {
            // Network communication with Stripe failed
        } catch (StripeException e) {
            // Display a very generic error to the user, and maybe send
            // yourself an email
        } catch (Exception e) {
            // Something else happened, completely unrelated to Stripe
        }
    }

    /**
     * question 5
     */
    private static void createUpdateDelete() {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("description", "Customer for isabella.anderson@example.com");
        customerParams.put("source", "tok_amex");
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "Customer for isabella.anderson@example.com");
        try {
            String id = Customer.create(customerParams).getId();
            Customer cu = Customer.retrieve(id);
            cu.update(updateParams);
            cu.delete();
        } catch (CardException e) {
            // Since it's a decline, CardException will be caught
            System.out.println("Status is: " + e.getCode());
            System.out.println("Message is: " + e.getMessage());
        } catch (RateLimitException e) {
            // Too many requests made to the API too quickly
        } catch (InvalidRequestException e) {
            // Invalid parameters were supplied to Stripe's API
        } catch (AuthenticationException e) {
            // Authentication with Stripe's API failed
            // (maybe you changed API keys recently)
        } catch (APIConnectionException e) {
            // Network communication with Stripe failed
        } catch (StripeException e) {
            // Display a very generic error to the user, and maybe send
            // yourself an email
        } catch (Exception e) {
            // Something else happened, completely unrelated to Stripe
        }
    }

    /**
     * question 6
     */
    private static void createUpdateDeleteInvoice() {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
        Map<String, Object> invoiceItemParams = new HashMap<String, Object>();
        invoiceItemParams.put("customer", "cus_C5Jhj1ul3srwDC");
        invoiceItemParams.put("amount", 2500);
        invoiceItemParams.put("currency", "usd");
        invoiceItemParams.put("description", "One-time setup fee");
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("amount", 2500);
        updateParams.put("description", "One-time setup fee");
        try {
            InvoiceItem.create(invoiceItemParams);
            InvoiceItem ii = InvoiceItem.retrieve("ii_1Bh6cb2eZvKYlo2CbBpP4SD2");
            ii.update(updateParams);
            ii.delete();
        } catch (CardException e) {
            // Since it's a decline, CardException will be caught
            System.out.println("Status is: " + e.getCode());
            System.out.println("Message is: " + e.getMessage());
        } catch (RateLimitException e) {
            // Too many requests made to the API too quickly
        } catch (InvalidRequestException e) {
            // Invalid parameters were supplied to Stripe's API
        } catch (AuthenticationException e) {
            // Authentication with Stripe's API failed
            // (maybe you changed API keys recently)
        } catch (APIConnectionException e) {
            // Network communication with Stripe failed
        } catch (StripeException e) {
            // Display a very generic error to the user, and maybe send
            // yourself an email
        } catch (Exception e) {
            // Something else happened, completely unrelated to Stripe
        }
    }

}

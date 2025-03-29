public class TransactionIdExtractFromHTMl {
    public static void main(String[] args) {


        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        int startIndex = html.indexOf("Transaction Id:");
        if(startIndex != -1){
            String transactionInfo = html.substring(startIndex);
            int endIndex = transactionInfo.indexOf("</p>");
            if(endIndex != -1){
                String result = transactionInfo.substring(0, endIndex);
                System.out.println(result);
            }

        }


    }
}

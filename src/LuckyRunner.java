public class LuckyRunner {
    public static void main(String[] args) {
        LottoTicket ticket = new LottoTicket(5, 59, 4);
        System.out.println(ticket.getLuckyNumbers());
    }
}

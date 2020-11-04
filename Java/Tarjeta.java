class Tarjeta extends Payment {
    Integer idcard;
    Integer cvv;
    Date date;

    public Tarjeta( Integer id, Integer idCard, Integer cvv, Date date ) {
        super( id );
        this.idCard = idCard;
        this.cvv = cvv;
        this.date = date;
    }
}
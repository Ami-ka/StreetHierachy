class House {
    private int number;
    private String ownerName;

    public House(int number, String ownerName) {
        this.number = number;
        this.ownerName = ownerName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "House Number: " + number + ", Owner: " + ownerName;
    }
}
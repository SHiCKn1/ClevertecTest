public class CheckLine {
    private Product product;
    private int productQuantity;
    private double price;
    private double total;
    private double amountOfDiscount;

    public CheckLine(Product product, int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
        this.price = this.product.getPrice();
    }

    public void calculate() {
        total = price * productQuantity;
        total = total*(1-amountOfDiscount/100);
    }

    public void setAmountOfDiscount(double amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    public void print() {
        System.out.printf(" %d  %-12s $%.2f  $%.2f \n",productQuantity,product.getDescription(),price,total);
        if (amountOfDiscount != 0) {
            System.out.printf("discount: %.0f",amountOfDiscount);
            System.out.println("%");
        }
    }

    @Override
    public String toString() {
        String returnSting = String.format(" %d  %-12s $%.2f  $%.2f \n",productQuantity,product.getDescription(),price,total);
        if (amountOfDiscount != 0) {
            returnSting = returnSting + String.format("discount: %.0f",amountOfDiscount);
            returnSting = returnSting + "%\n";
        }
        return returnSting;
    }

    public double getTotal() {
        return total;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmountOfDiscount() {
        return amountOfDiscount;
    }
}

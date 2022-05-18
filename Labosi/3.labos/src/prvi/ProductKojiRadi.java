package prvi;



class Product<Id, Price extends Number> {
    private Id id;
    private Price price;

    public Product(Id id, Price price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        char[] charId = id.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charId.length; i++) {
            if (i == charId.length - 1) {
                sb.append(charId[i]);
            } else {
                sb.append(charId[i]);
                sb.append("-");
            }
        }
        return sb.toString();
    }


    public void setId(Id newid) {
        if (newid.toString().equals(id.toString())) {
            throw new IllegalArgumentException("Id " + id + " is the same.");
        } else {
            this.id = newid;
        }
    }

    public String getFirstNDigitsOfPrice(int nDigits) {
        String firstNDigits = price.toString();
        if (firstNDigits.contains(".")) {
            firstNDigits = firstNDigits.substring(0, firstNDigits.lastIndexOf("."));
        }
        if (nDigits > firstNDigits.length()) {
            return firstNDigits;
        } else {
            return firstNDigits.substring(0, nDigits);
        }
    }
}
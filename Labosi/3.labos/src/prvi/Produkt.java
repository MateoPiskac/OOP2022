package prvi;

public class Produkt<Id, Price extends Number> {
    private Id id;
    private Price price;

    public Produkt(Id id, Price price) {
        this.id = id;
        this.price = price;
    }

    public String geId() {
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

    public void setId(Id newId) {
        if (id.toString().equals(newId.toString()))
            throw new IllegalArgumentException("Id" + newId + " is the same.");
        else
            this.id = newId;
    }

    public String getFirstNDigitsOfPrice(int nDigits) {
        String firstNDigits = price.toString();
        if (firstNDigits.contains("."))
            firstNDigits = firstNDigits.substring(0, firstNDigits.indexOf("."));
        if (nDigits > firstNDigits.length())
            return firstNDigits;
        else
            return firstNDigits.substring(0, nDigits);
    }
}


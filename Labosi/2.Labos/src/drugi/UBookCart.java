package drugi;

interface UBookCart {
    /**
     * Pozivom metode simulira se kupovina knjige
     * Sukladno kupljenoj količini i vrsti knjiga potrebno je ažurirati košaricu
     *
     * @param ISBN - ISBN knjige koja se kupuje
     * @param quantity - količina knjiga koja se kupuje
     */
    public void add(String ISBN, int quantity);
    /**
     * Knjigu je moguće ukloniti samo ako je prisutna u košarici
     * Potrebno je azurirati košaricu
     *
     * @param ISBN - ISBN knjige koja se uklanja
     * @param quantity - količina knjige koja se uklanja
     */
    public void remove(String ISBN,int quantity);

    /**
     * @return vraća trenutnu cijenu košarice
     */
    public float getCost();

}

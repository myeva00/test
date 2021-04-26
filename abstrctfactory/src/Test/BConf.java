package Test;

public class BConf implements BFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        return new Apple();
    }

    @Override
    public Vegetables CreatV() {
        return null;
    }
}

package Test;

public class AConV implements AFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreatV() {
        return new cabbage();
    }
}

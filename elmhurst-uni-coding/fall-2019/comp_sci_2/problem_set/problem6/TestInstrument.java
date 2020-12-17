
public class TestInstrument
{
    public static void main(String[] args){
        ElectricGuitar six = new ElectricGuitar();
        ElectricBassGuitar bass = new ElectricBassGuitar();
        six.play();
        bass.play();
        six = new ElectricGuitar(7);
        bass = new ElectricBassGuitar(5);
        six.play();
        bass.play();
    }
}

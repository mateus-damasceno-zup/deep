package model;

public class VagaEstacionamento {

    private int idVaga;
    private String carrosPlaca;
    private Integer donoId;

    private String horaEntrada;
    private double tempoPermanecia;

    private double valorPago;

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getCarrosPlaca() {
        return carrosPlaca;
    }

    public void setCarrosPlaca(String carrosPlaca) {
        this.carrosPlaca = carrosPlaca;
    }

    public Integer getDonoId() {
        return donoId;
    }

    public void setDonoId(Integer donoId) {
        this.donoId = donoId;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double getTempoPermanecia() {
        return tempoPermanecia;
    }

    public void setTempoPermanecia(double tempoPermanecia) {
        this.tempoPermanecia = tempoPermanecia;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}

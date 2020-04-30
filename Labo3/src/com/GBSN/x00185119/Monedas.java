package com.GBSN.x00185119;

public class Monedas {


    private int mCent;
    private int mCinco;
    private int mDiez;
    private int mCora;
    private int mDollar;


    public Monedas(int mCent, int mCinco, int mDiez, int mCora, int mDollar){
        this.mCent = mCent;
        this.mCinco = mCinco;
        this.mCora = mCora;
        this.mDiez = mDiez;
        this.mDollar= mDollar;
    }

    public double getSumatoria(){

        return (mCent*0.010 + mCinco*0.050 + mDiez*0.10 + mCora*0.250 + mDollar*1.00);

    }

    public int getmCent(){
        return mCent;
    }

    public int getmCora() {
        return mCora;
    }

    public int getmCinco() {
        return mCinco;
    }

    public int getmDiez() {
        return mDiez;
    }

    public int getmDollar() {
        return mDollar;
    }
}
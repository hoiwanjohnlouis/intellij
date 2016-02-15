package com.ntt2015.observerpattern;

/*
    Copyright (c) 2014  Hoi Wan Louis
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    // Could be used to set how many seconds to wait
    // in Thread.sleep() below

    // private int startTime;
    private String stock;
    private double price;

    // Will hold reference to the StockGrabber object

    private ISubject stockGrabber;

    public GetTheStock(ISubject stockGrabber, int newStartTime, String newStock, double newPrice){

        // Store the reference to the stockGrabber object so
        // I can make calls to its methods

        this.stockGrabber = stockGrabber;

        // startTime = newStartTime;  Not used to have variable sleep time
        stock = newStock;
        price = newPrice;

    }


    public void run() {

        // send price updates to all staging2016 with
        // a two second delay, just like stock ticker


        for(int i = 1; i <= 20; i++){

            try{

                // Sleep for 2 seconds
                Thread.sleep(2000);

                // Use Thread.sleep(startTime * 1000); to
                // make sleep time variable
            }
            catch(InterruptedException e)
            {}

            // Generates a random number between -.03 and .03

            double randNum = (Math.random() * (.06)) - .03;

            // Formats decimals to 2 places

            DecimalFormat df = new DecimalFormat("#.##");

            // Change the price and then convert it back into a double

            price = Double.valueOf(df.format((price + randNum)));

            if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);
            if(stock == "AAPL") ((StockGrabber) stockGrabber).setAAPLPrice(price);
            if(stock == "GOOG") ((StockGrabber) stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();

        }
    }

}
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

import java.util.ArrayList;


// Uses the Subject interface to update all Observers

public class StockGrabber implements ISubject {

    private ArrayList<IObserver> observers;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;


    public StockGrabber() {

        // Creates an ArrayList to hold all observers

        observers = new ArrayList<IObserver>();

    }


    public void register(IObserver newObserver) {

        // Adds a new observer to the ArrayList

        observers.add(newObserver);

    }


    public void unregister(IObserver deleteObserver) {

        // Get the index of the observer to delete

        int observerIndex = observers.indexOf(deleteObserver);

        // Print out message (Have to increment index to match)

        System.out.println("Observer " + (observerIndex + 1) + " deleted");

        // Removes observer from the ArrayList

        observers.remove(observerIndex);

    }


    public void notifyObserver() {

        // Cycle through all observers and notifies them of
        // price changes

        for (IObserver observer : observers) {

            observer.update(ibmPrice, aaplPrice, googPrice);

        }

    }


    // Change prices for all staging2016 and notifies observers of changes

    public void setIBMPrice(double newIBMPrice) {

        this.ibmPrice = newIBMPrice;
        notifyObserver();

    }


    public void setAAPLPrice(double newAAPLPrice) {

        this.aaplPrice = newAAPLPrice;

        notifyObserver();

    }


    public void setGOOGPrice(double newGOOGPrice) {

        this.googPrice = newGOOGPrice;

        notifyObserver();

    }

}

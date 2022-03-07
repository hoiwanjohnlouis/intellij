/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix27.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Enum4AdvSide enum defines all the possible values for AdvSide (FIX) fields.
 * It consists of 3 fields.
 *
 * String sideAction           type of transaction for field as defined by the FIX protocol document, no duplicates
 * String sideName             short name of transaction for as defined by the FIX protocol document, no duplicates
 * String sideDescription      describes what the action entails
 */
public enum Enum54Side {

    BUY ("1", "BUY", "Buy"),
    SELL ("2", "SELL", "Sell"),
    BUY_MINUS ("3", "BUY_MINUS", "Buy minus"),
    SELL_PLUS ("4", "SELL_PLUS", "Sell plus"),
    SELL_SHORT ("5", "SELL_SHORT", "Sell short"),
    SELL_SHORT_EXEMPT ("6", "SELL_SHORT_EXEMPT", "Sell short exempt"),
    UNDISCLOSED ("7", "UNDISCLOSED", "Undisclosed (valid for IOI and List Order messages only)"),
    CROSS ("8", "CROSS",
            "Cross (orders where counterparty is an exchange, valid for all messages except IOIs)"),
    CROSS_SHORT ("9", "CROSS_SHORT", "Cross short"),
    CROSS_SHORT_EXEMPT ("A", "CROSS_SHORT_EXEMPT", "Cross short exempt"),
    AS_DEFINED ("B", "AS_DEFINED", "As Defined (for use with multileg instruments)"),
    OPPOSITE ("C", "OPPOSITE", "Opposite (for use with multileg instruments)"),
    SUBSCRIBE ("D", "SUBSCRIBE", "Subscribe (e.g. CIV)"),
    REDEEM ("E", "REDEEM", "Redeem (e.g. CIV)"),
    LEND_FINANCING ("F", "LEND_FINANCING", "Lend (FINANCING - identifies direction of collateral)"),
    BORROW_FINANCING ("G", "BORROW_FINANCING", "Borrow (FINANCING - identifies direction of collateral)"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum54Side(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return this.action;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName());
        sb.append(":[");
        sb.append(getAction());
        sb.append(",");
        sb.append(getName());
        sb.append(",");
        sb.append(getDescription());
        sb.append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }


    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        System.out.println(Enum54Side.BUY);
        System.out.println(Enum54Side.SELL);
        System.out.println(Enum54Side.BUY_MINUS);
        System.out.println(Enum54Side.SELL_PLUS);
        System.out.println(Enum54Side.SELL_SHORT);
        System.out.println(Enum54Side.SELL_SHORT_EXEMPT);
        System.out.println(Enum54Side.UNDISCLOSED);
        System.out.println(Enum54Side.CROSS);
        System.out.println(Enum54Side.CROSS_SHORT);
        System.out.println(Enum54Side.CROSS_SHORT_EXEMPT);
        System.out.println(Enum54Side.AS_DEFINED);
        System.out.println(Enum54Side.OPPOSITE);
        System.out.println(Enum54Side.SUBSCRIBE);
        System.out.println(Enum54Side.REDEEM);
        System.out.println(Enum54Side.LEND_FINANCING);
        System.out.println(Enum54Side.BORROW_FINANCING);
    }
}

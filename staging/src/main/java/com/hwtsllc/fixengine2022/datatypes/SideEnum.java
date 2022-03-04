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

package com.hwtsllc.fixengine2022.datatypes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * AdvSideEnum enum defines all the possible values for AdvSide (FIX) fields.
 * It consists of 3 fields.
 *
 * String sideAction           type of transaction for field as defined by the FIX protocol document, no duplicates
 * String sideName             short name of transaction for as defined by the FIX protocol document, no duplicates
 * String sideDescription      describes what the action entails
 */
public enum SideEnum {

    BUY ("1", "BUY", ""),
    SELL ("2", "SELL", ""),
    BUY_MINUS ("3", "BUY_MINUS", ""),
    SELL_PLUS ("4", "SELL_PLUS", ""),
    SELL_SHORT ("5", "SELL_SHORT", ""),
    SELL_SHORT_EXEMPT ("6", "SELL_SHORT_EXEMPT", ""),
    UNDISCLOSED ("7", "UNDISCLOSED", ""),
    CROSS ("8", "CROSS", ""),
    CROSS_SHORT ("9", "CROSS_SHORT", ""),
    CROSS_SHORT_EXEMPT ("A", "CROSS_SHORT_EXEMPT", ""),
    AS_DEFINED ("B", "AS_DEFINED", ""),
    OPPOSITE ("C", "OPPOSITE", ""),
    SUBSCRIBE ("D", "SUBSCRIBE", ""),
    REDEEM ("E", "REDEEM", ""),
    LEND_FINANCING ("F", "LEND_FINANCING", ""),
    BORROW_FINANCING ("G", "BORROW_FINANCING", ""),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String sideAction;
    private final String sideName;
    private final String sideDescription;

    SideEnum(final String sideAction, final String sideName, final String sideDescription) {
        this.sideAction = sideAction;
        this.sideName = sideName;
        this.sideDescription = sideDescription;
    }

    public String getSideTypeName() {
        return this.name();
    }
    public String getSideAction() {
        return this.sideAction;
    }
    public String getSideName() {
        return this.sideName;
    }
    public String getSideDescription() {
        return this.sideDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSideTypeName());
        sb.append(":[");
        sb.append(getSideAction());
        sb.append(",");
        sb.append(getSideName());
        sb.append(",");
        sb.append(getSideDescription());
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        System.out.println(SideEnum.BUY);
        System.out.println(SideEnum.SELL);
    }
}

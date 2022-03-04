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
 * AdvSideType enum defines all the possible values for AdvSide (FIX) fields.
 * It consists of 3 fields.
 *
 * String advSideAction       type of transaction for field as defined by the FIX protocol document, no duplicates
 * String advSideName         short name of transaction for as defined by the FIX protocol document, no duplicates
 * String advSideDescription  describes what the action entails
 */
public enum AdvSideType {

    BUY ("B", "BUY", "Buy"),
    SELL ("S", "SELL", "Sell"),
    CROSS ("X", "CROSS", "Cross"),
    TRADE ("T", "TRADE", "Trade"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String advSideAction;
    private final String advSideName;
    private final String advSideDescription;

    AdvSideType(final String advSideAction, final String advSideName, final String advSideDescription) {
        this.advSideAction = advSideAction;
        this.advSideName = advSideName;
        this.advSideDescription = advSideDescription;
    }

    public String getAdvSideEnumName() {
        return this.name();
    }
    public String getAdvSideAction() {
        return advSideAction;
    }
    public String getAdvSideName() {
        return advSideName;
    }
    public String getAdvSideDescription() {
        return advSideDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAdvSideEnumName())
                .append("=[")
                .append(getAdvSideAction())
                .append(",")
                .append(getAdvSideName())
                .append(",")
                .append(getAdvSideDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(AdvSideType.BUY);
        System.out.println(AdvSideType.SELL);
        System.out.println(AdvSideType.CROSS);
        System.out.println(AdvSideType.TRADE);
    }
}

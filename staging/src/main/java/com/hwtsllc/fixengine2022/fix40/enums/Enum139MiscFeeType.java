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

package com.hwtsllc.fixengine2022.fix40.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum139MiscFeeType {
    REGULATORY( "1", "REGULATORY", "1 - Regulatory (e.g. SEC)" ),
    TAX( "2", "TAX", "2 - Tax" ),
    LOCAL_COMMISSION( "3", "LOCAL_COMMISSION", "3 - Local Commission" ),
    EXCHANGE_FEES( "4", "EXCHANGE_FEES", "4 - Exchange Fees" ),
    STAMP( "5", "STAMP", "5 - Stamp" ),
    LEVY( "6", "LEVY", "6 - Levy" ),
    OTHER( "7", "OTHER", "7 - Other" ),
    MARKUP( "8", "MARKUP", "8 - Markup" ),
    CONSUMPTION_TAX( "9", "CONSUMPTION_TAX", "9 - Consumption Tax" ),
    PER_TRANSACTION( "10", "PER_TRANSACTION", "10 - Per transaction" ),
    CONVERSION( "11", "CONVERSION", "11 - Conversion" ),
    AGENT( "12", "AGENT", "12 - Agent" ),
    TRANSFER_FEE( "13", "TRANSFER_FEE", "13 - Transfer Fee" ),
    SECURITY_LENDING( "14", "SECURITY_LENDING", "14 - Security Lending" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum139MiscFeeType(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
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
     */
    public static void main(String[] args) {
        System.out.println(Enum139MiscFeeType.REGULATORY);
        System.out.println(Enum139MiscFeeType.TAX);
        System.out.println(Enum139MiscFeeType.LOCAL_COMMISSION);
        System.out.println(Enum139MiscFeeType.EXCHANGE_FEES);
        System.out.println(Enum139MiscFeeType.STAMP);

        System.out.println(Enum139MiscFeeType.LEVY);
        System.out.println(Enum139MiscFeeType.OTHER);
        System.out.println(Enum139MiscFeeType.MARKUP);
        System.out.println(Enum139MiscFeeType.CONSUMPTION_TAX);
        System.out.println(Enum139MiscFeeType.PER_TRANSACTION);

        System.out.println(Enum139MiscFeeType.CONVERSION);
        System.out.println(Enum139MiscFeeType.AGENT);
        System.out.println(Enum139MiscFeeType.TRANSFER_FEE);
        System.out.println(Enum139MiscFeeType.SECURITY_LENDING);
    }
}

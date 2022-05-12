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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum340TradSesStatus;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag340
 *  Enu
 *  TradSesStatus
 *
 *      0-6 msg types
 *      UNKNOWN( "0", "UNKNOWN", "0 - Unknown" ),
 *      HALTED( "1", "HALTED", "1 - Halted" ),
 *      OPEN( "2", "OPEN", "2 - Open" ),
 *      CLOSED( "3", "CLOSED", "3 - Closed" ),
 *      PRE_OPEN( "4", "PRE_OPEN", "4 - Pre-Open" ),
 *      PRE_CLOSE( "5", "PRE_CLOSE", "5 - Pre-Close" ),
 *      REQUEST_REJECTED( "6", "REQUEST_REJECTED", "6 - Request Rejected" ),
 */
public class Log340EnuTradSesStatus extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final Enum340TradSesStatus dataValue;

    public final static Enum340TradSesStatus TESTA_ENU_TRAD_SES_STATUS = Enum340TradSesStatus.REQUEST_REJECTED;
    public final static Enum340TradSesStatus TESTB_ENU_TRAD_SES_STATUS = Enum340TradSesStatus.PRE_OPEN;

    public Log340EnuTradSesStatus(Enum340TradSesStatus dataValue) {
        setFixType(FIX42.FIX340_ENU_TRAD_SES_STATUS);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Log340EnuTradSesStatus tagData;

        tagData = new Log340EnuTradSesStatus(TESTA_ENU_TRAD_SES_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log340EnuTradSesStatus(TESTB_ENU_TRAD_SES_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}

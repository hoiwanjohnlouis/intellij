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
import com.hwtsllc.fixengine2022.fix42.enums.Enum339TrdSesMode;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag339
 *  Enu
 *  TradSesMode
 *
 *      1-3 msg types
 *      TESTING( "1", "TESTING", "1 - Testing" ),
 *      SIMULATED( "2", "SIMULATED", "2 - Simulated" ),
 *      PRODUCTION( "3", "PRODUCTION", "3 - Production" ),
 */
public class Tag339EnuTradSesMode extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final Enum339TrdSesMode dataValue;

    public final static Enum339TrdSesMode TESTA_ENU_TRAD_SES_MODE = Enum339TrdSesMode.TESTING;
    public final static Enum339TrdSesMode TESTB_ENU_TRAD_SES_MODE = Enum339TrdSesMode.SIMULATED;

    public Tag339EnuTradSesMode(Enum339TrdSesMode dataValue) {
        setFixType(FIX42.FIX339_ENU_TRAD_SES_MODE);
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
        Tag339EnuTradSesMode tagData;

        tagData = new Tag339EnuTradSesMode(TESTA_ENU_TRAD_SES_MODE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag339EnuTradSesMode(TESTB_ENU_TRAD_SES_MODE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}

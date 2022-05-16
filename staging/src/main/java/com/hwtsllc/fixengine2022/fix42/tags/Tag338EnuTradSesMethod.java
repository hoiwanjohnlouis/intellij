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
import com.hwtsllc.fixengine2022.fix42.enums.Enum338TradSesMethod;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag338
 *  Enu
 *  TradSesMethod
 *
 *      1-3 msg types
 *      ELECTRONIC( "1", "ELECTRONIC", "1 - Electronic" ),
 *      OPEN_OUTCRY( "2", "OPEN_OUTCRY", "2 - Open Outcry" ),
 *      TWO_PARTY( "3", "TWO_PARTY", "3 - Two Party" ),
 */
public class Tag338EnuTradSesMethod extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum338TradSesMethod dataValue;

    public final static Enum338TradSesMethod TESTA_ENU_TRAD_SES_METHOD
            = Enum338TradSesMethod.ELECTRONIC;
    public final static Enum338TradSesMethod TESTB_ENU_TRAD_SES_METHOD
            = Enum338TradSesMethod.OPEN_OUTCRY;

    public Tag338EnuTradSesMethod(Enum338TradSesMethod dataValue) {
        setFixType(FIX42.FIX338_ENU_TRAD_SES_METHOD);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag338EnuTradSesMethod tagData;

        tagData = new Tag338EnuTradSesMethod(TESTA_ENU_TRAD_SES_METHOD);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag338EnuTradSesMethod(TESTB_ENU_TRAD_SES_METHOD);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}

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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum716SettlSessID;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  716
 *  SettlSessID
 *  Identifies a specific settlement session
 *  Valid values:
 *      ITD - Intraday
 *      RTH - Regular Trading Hours
 *      ETH - Electronic Trading Hours
 *      EOD - End Of Day
 */
public class Log716EnuSettlSessID extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum716SettlSessID dataValue;

    public final static Enum716SettlSessID TESTA_ENU_SETTL_SESS_ID
            = Enum716SettlSessID.INTRADAY;
    public final static Enum716SettlSessID TESTB_ENU_SETTL_SESS_ID
            = Enum716SettlSessID.END_OF_DAY;

    public Log716EnuSettlSessID(Enum716SettlSessID dataValue) {
        setFixType(FIX44.FIX716_ENU_SETTL_SESS_ID);
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
        Log716EnuSettlSessID tagData;

        tagData = new Log716EnuSettlSessID(TESTA_ENU_SETTL_SESS_ID);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log716EnuSettlSessID(TESTB_ENU_SETTL_SESS_ID);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}

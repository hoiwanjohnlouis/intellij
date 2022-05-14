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
import com.hwtsllc.fixengine2022.fix42.enums.Enum388DiscretionInst;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag388
 *  Enu
 *  DiscretionInst
 *
 *      0-7 msg types
 *      RELATED_TO_DISPLAYED_PRICE( "0", "RELATED_TO_DISPLAYED_PRICE", "0 - Related to displayed price" ),
 *      RELATED_TO_MARKET_PRICE( "1", "RELATED_TO_MARKET_PRICE", "1 - Related to market price" ),
 *      RELATED_TO_PRIMARY_PRICE( "2", "RELATED_TO_PRIMARY_PRICE", "2 - Related to primary price" ),
 *      RELATED_TO_LOCAL_PRIMARY_PRICE( "3", "RELATED_TO_LOCAL_PRIMARY_PRICE",
 *                          "3 - Related to local primary price" ),
 *      RELATED_TO_MIDPOINT_PRICE( "4", "RELATED_TO_MIDPOINT_PRICE", "4 - Related to midpoint price" ),
 *      RELATED_TO_LAST_TRADE_PRICE( "5", "RELATED_TO_LAST_TRADE_PRICE", "5 - Related to last trade price" ),
 *      RELATED_TO_VWAP( "6", "RELATED_TO_VWAP", "6 - Related to VWAP" ),
 *      AVERAGE_PRICE_GUARANTEE( "7", "AVERAGE_PRICE_GUARANTEE", "7 - Average Price Guarantee" ),
 */
public class Tag388EnuDiscretionInst extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum388DiscretionInst dataValue;

    public final static Enum388DiscretionInst TESTA_ENU_DISCRETION_INST
            = Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE;
    public final static Enum388DiscretionInst TESTB_ENU_DISCRETION_INST
            = Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE;

    public Tag388EnuDiscretionInst(Enum388DiscretionInst dataValue) {
        setFixType(FIX42.FIX388_ENU_DISCRETION_INST);
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
     * wrapper to return the description of the underlying ENUM data
     */
    @Override
    public String toEnumString() {
        return this.dataValue.getDescription();
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
        Tag388EnuDiscretionInst tagData;

        tagData = new Tag388EnuDiscretionInst(TESTA_ENU_DISCRETION_INST);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag388EnuDiscretionInst(TESTB_ENU_DISCRETION_INST);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}

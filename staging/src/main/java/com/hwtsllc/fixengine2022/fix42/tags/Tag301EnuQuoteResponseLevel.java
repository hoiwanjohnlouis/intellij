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
import com.hwtsllc.fixengine2022.fix42.enums.Enum301QuoteResponseLevel;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  301
 *  QuoteResponseLevel
 *
 *      0-2 msg types
 *      NO_ACKNOWLEDGEMENT( "0", "NO_ACKNOWLEDGEMENT", "0 - No Acknowledgement (default)" ),
 *      ACKNOWLEDGE_NEGATIVE_OR_ERRORS( "1", "ACKNOWLEDGE_NEGATIVE_OR_ERRORS",
 *                      "1 - Acknowledge only negative or erroneous quotes" ),
 *      ACKNOWLEDGE_EACH_QUOTE( "2", "ACKNOWLEDGE_EACH_QUOTE", "2 - Acknowledge each quote messages" ),
 */
public class Tag301EnuQuoteResponseLevel extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum301QuoteResponseLevel dataValue;

    public final static Enum301QuoteResponseLevel TESTA_ENU_QUOTE_RESPONSE_LEVEL
            = Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE;
    public final static Enum301QuoteResponseLevel TESTB_ENU_QUOTE_RESPONSE_LEVEL
            = Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS;

    public Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel dataValue) {
        setFixType(FIX42.FIX301_ENU_QUOTE_RESPONSE_LEVEL);
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
        Tag301EnuQuoteResponseLevel tagData;

        tagData = new Tag301EnuQuoteResponseLevel(TESTA_ENU_QUOTE_RESPONSE_LEVEL);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag301EnuQuoteResponseLevel(TESTB_ENU_QUOTE_RESPONSE_LEVEL);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}

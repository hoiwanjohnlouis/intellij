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
import com.hwtsllc.fixengine2022.fix42.enums.Enum286OpenCLoseSettlFlag;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  286
 *  OpenCloseSettleFlag
 *
 *      0-5 msg types
 *      DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT( "0", "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT",
 *                  "0 - Daily Open / Close / Settlement entry" ),
 *      SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT( "1", "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT",
 *                  "1 - Session Open / Close / Settlement entry" ),
 *      DELIVERY_SETTLEMENT( "2", "DELIVERY_SETTLEMENT", "2 - Delivery Settlement entry" ),
 *      EXPECTED( "3", "EXPECTED", "3 - Expected entry" ),
 *      PREVIOUS_BUSINESS_DAY( "4", "PREVIOUS_BUSINESS_DAY", "4 - Entry from previous business day" ),
 *      THEORETICAL_PRICE_VALUE( "5", "THEORETICAL_PRICE_VALUE", "5 - Theoretical Price value" ),
 */
public class Tag286EnuOpenCloseSettleFlag extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum286OpenCLoseSettlFlag dataValue;

    public final static Enum286OpenCLoseSettlFlag TESTA_ENU_OPEN_CLOSE_SETTLE_FLAG
            = Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT;
    public final static Enum286OpenCLoseSettlFlag TESTB_ENU_OPEN_CLOSE_SETTLE_FLAG
            = Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT;

    public Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag dataValue) {
        setFixType(FIX42.FIX286_ENU_OPEN_CLOSE_SETTLE_FLAG);
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
        Tag286EnuOpenCloseSettleFlag tagData;

        tagData = new Tag286EnuOpenCloseSettleFlag(TESTA_ENU_OPEN_CLOSE_SETTLE_FLAG);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag286EnuOpenCloseSettleFlag(TESTB_ENU_OPEN_CLOSE_SETTLE_FLAG);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}

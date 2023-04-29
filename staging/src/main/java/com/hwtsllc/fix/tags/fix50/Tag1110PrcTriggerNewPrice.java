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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.datatypes.MyPriceType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1110
 *  TriggerNewPrice
 *  Price
 *  <p>
 *  The Price that the order should have after the trigger has hit.
 *  <p></p>
 *  Could be applicable for any trigger type, but must be specified for Trigger Type 1.
 */
public class Tag1110PrcTriggerNewPrice extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_TRIGGER_NEW_PRICE
            = 0.1110D;
    public final static double TESTB_PRC_TRIGGER_NEW_PRICE
            = 0.01110D;

    public Tag1110PrcTriggerNewPrice(MyPriceType dataValue) {
        setFixType( FIX50.FIX1110_PRC_TRIGGER_NEW_PRICE );
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1110PrcTriggerNewPrice tagData;

        tagData = new Tag1110PrcTriggerNewPrice(new MyPriceType( TESTA_PRC_TRIGGER_NEW_PRICE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1110PrcTriggerNewPrice(new MyPriceType( TESTB_PRC_TRIGGER_NEW_PRICE ) );
        System.out.println(tagData.toVerboseString());
    }
}

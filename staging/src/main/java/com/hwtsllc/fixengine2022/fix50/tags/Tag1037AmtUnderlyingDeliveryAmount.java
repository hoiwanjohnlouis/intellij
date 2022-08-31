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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1037
 *  UnderlyingDeliveryAmount
 *  Amt
 *  <p>
 *  Indicates the underlying position amount to be delivered
 */
public class Tag1037AmtUnderlyingDeliveryAmount extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_UNDERLYING_DELIVERY_AMOUNT
            = 0.1037D;
    public final static double TESTB_AMT_UNDERLYING_DELIVERY_AMOUNT
            = 0.01037D;

    public Tag1037AmtUnderlyingDeliveryAmount(MyAmtType dataValue) {
        setFixType( FIX50.FIX1037_AMT_UNDERLYING_DELIVERY_AMOUNT );
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        Tag1037AmtUnderlyingDeliveryAmount tagData;

        tagData = new Tag1037AmtUnderlyingDeliveryAmount(new MyAmtType( TESTA_AMT_UNDERLYING_DELIVERY_AMOUNT ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1037AmtUnderlyingDeliveryAmount(new MyAmtType( TESTB_AMT_UNDERLYING_DELIVERY_AMOUNT ) );
        System.out.println(tagData.toVerboseString());
    }
}

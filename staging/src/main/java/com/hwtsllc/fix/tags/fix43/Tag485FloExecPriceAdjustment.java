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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MyFloatType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  485
 *  ExecPriceAdjustment
 *  float
 *  <p></p>
 *  For CIV the amount or percentage by which the fund unit/share price was adjusted,
 *  as indicated by ExecPriceType (484)
 */
public class Tag485FloExecPriceAdjustment extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_EXEC_PRICE_ADJUSTMENT = 0.485F;
    public final static float TESTB_FLO_EXEC_PRICE_ADJUSTMENT = 0.584F;

    public Tag485FloExecPriceAdjustment(MyFloatType dataValue) {
        setFixType(FIX43.FIX485_FLO_EXEC_PRICE_ADJUSTMENT);
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
        Tag485FloExecPriceAdjustment tagData;

        tagData = new Tag485FloExecPriceAdjustment(new MyFloatType(TESTA_FLO_EXEC_PRICE_ADJUSTMENT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag485FloExecPriceAdjustment(new MyFloatType(TESTB_FLO_EXEC_PRICE_ADJUSTMENT) );
        System.out.println(tagData.toVerboseString());
    }
}

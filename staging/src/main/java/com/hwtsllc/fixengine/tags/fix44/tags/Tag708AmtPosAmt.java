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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyAmtType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  708
 *  PosAmt
 *  Amt
 *  <p></p>
 *  Position amount
 */
public class Tag708AmtPosAmt extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_POS_AMT
            = 7.08D;
    public final static double TESTB_AMT_POS_AMT
            = 0.008D;

    public Tag708AmtPosAmt(MyAmtType dataValue) {
        setFixType( FIX44.FIX708_AMT_POS_AMT );
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
        Tag708AmtPosAmt tagData;

        tagData = new Tag708AmtPosAmt(new MyAmtType( TESTA_AMT_POS_AMT ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag708AmtPosAmt(new MyAmtType( TESTB_AMT_POS_AMT ) );
        System.out.println(tagData.toVerboseString());
    }
}

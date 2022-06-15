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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  855
 *  SecondaryTrdType
 *  int
 *  <p></p>
 *  Additional TrdType (see tag 828) assigned to a trade by trade match system.
 */
public class Tag855IntSecondaryTrdType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_SECONDARY_TRD_TYPE
            = 855;
    public final static int TESTB_INT_SECONDARY_TRD_TYPE
            = 55;

    public Tag855IntSecondaryTrdType(MyIntType dataValue) {
        setFixType( FIX44.FIX855_INT_SECONDARY_TRD_TYPE );
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag855IntSecondaryTrdType tagData;

        tagData = new Tag855IntSecondaryTrdType(new MyIntType( TESTA_INT_SECONDARY_TRD_TYPE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag855IntSecondaryTrdType(new MyIntType( TESTB_INT_SECONDARY_TRD_TYPE ) );
        System.out.println(tagData.toVerboseString());
    }
}

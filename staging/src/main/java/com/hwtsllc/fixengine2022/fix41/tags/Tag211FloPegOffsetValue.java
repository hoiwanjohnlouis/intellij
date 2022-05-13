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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  211
 *  PegOffsetValue
 *  float
 *  <p>
 *  Amount (signed) added to the peg for a pegged order in the context of the PegOffsetType (836)
 *  <p>
 *  (Prior to FIX 4.4 this field was of type PriceOffset)
 */
public class Tag211FloPegOffsetValue extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_PEG_DIFFERENCE = 2.11F;
    public final static float TESTB_FLO_PEG_DIFFERENCE = 1.12F;

    public Tag211FloPegOffsetValue(MyFloatType dataValue) {
        setFixType(FIX41.FIX211_FLO_PEG_DIFFERENCE);
        this.dataValue = dataValue;
    }

    public float getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        Tag211FloPegOffsetValue tagData;

        tagData = new Tag211FloPegOffsetValue(new MyFloatType(TESTA_FLO_PEG_DIFFERENCE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag211FloPegOffsetValue(new MyFloatType(TESTB_FLO_PEG_DIFFERENCE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}

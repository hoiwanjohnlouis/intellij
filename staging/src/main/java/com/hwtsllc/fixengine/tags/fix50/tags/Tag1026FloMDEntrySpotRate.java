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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyFloatType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1026
 *  MDEntrySpotRate
 *  float
 *  <p>
 *  The spot rate for an FX entry
 */
public class Tag1026FloMDEntrySpotRate extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_MD_ENTRY_SPOT_RATE
            = 0.1026F;
    public final static float TESTB_FLO_MD_ENTRY_SPOT_RATE
            = 0.01026F;

    public Tag1026FloMDEntrySpotRate(MyFloatType dataValue) {
        setFixType( FIX50.FIX1026_FLO_MD_ENTRY_SPOT_RATE );
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
        Tag1026FloMDEntrySpotRate tagData;

        tagData = new Tag1026FloMDEntrySpotRate(new MyFloatType( TESTA_FLO_MD_ENTRY_SPOT_RATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1026FloMDEntrySpotRate(new MyFloatType( TESTB_FLO_MD_ENTRY_SPOT_RATE ) );
        System.out.println(tagData.toVerboseString());
    }
}

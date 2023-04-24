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
import com.hwtsllc.fixengine.datatypes.MyPriceType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  991
 *  RndPx
 *  Price
 *  <p>
 *  Specifies average price rounded to quoted precision.
 */
public class Tag991PrcRndPx extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_RND_PX
            = 0.991D;
    public final static double TESTB_PRC_RND_PX
            = 0.0991D;

    public Tag991PrcRndPx(MyPriceType dataValue) {
        setFixType( FIX50.FIX991_PRC_RND_PX );
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
        Tag991PrcRndPx tagData;

        tagData = new Tag991PrcRndPx(new MyPriceType( TESTA_PRC_RND_PX ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag991PrcRndPx(new MyPriceType( TESTB_PRC_RND_PX ) );
        System.out.println(tagData.toVerboseString());
    }
}

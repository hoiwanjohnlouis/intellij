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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  400
 *  BidDescriptor
 *  String
 *  <p></p>
 *  BidDescriptor value.
 *  <p></p>
 *  Usage depends upon BidDescriptorTyp (399).
 *  <p>
 *  If BidDescriptorType = 1
 *  Industrials etc - Free text
 *  <p>
 *  If BidDescriptorType = 2
 *  "FR" etc - ISO Country Codes
 *  <p>
 *  If BidDescriptorType = 3
 *  FT00, FT250, STOX - Free text
 */
public class Tag400StrBidDescriptor extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_BID_DESCRIPTOR
            = "FayWray-Tag400StrBidDescriptor";
    public final static String TESTB_STR_BID_DESCRIPTOR
            = "VinaFayWray-Tag400StrBidDescriptor";

    public Tag400StrBidDescriptor(MyStringType dataValue) {
        setFixType(FIX42.FIX400_STR_BID_DESCRIPTOR);
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
        Tag400StrBidDescriptor tagData;

        tagData = new Tag400StrBidDescriptor(new MyStringType(TESTA_STR_BID_DESCRIPTOR) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag400StrBidDescriptor(new MyStringType(TESTB_STR_BID_DESCRIPTOR) );
        System.out.println(tagData.toVerboseString());
    }
}

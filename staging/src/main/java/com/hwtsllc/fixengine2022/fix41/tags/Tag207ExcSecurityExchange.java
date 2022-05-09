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
import com.hwtsllc.fixengine2022.datatypes.MyExchangeType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  207
 *  SecurityExchange
 *  Exchange
 *  <p>
 *  Market used to help identify a security.
 *  <p>
 *  Valid values:
 *      See "Appendix 6-C"
 */
public class Tag207ExcSecurityExchange extends FIX41Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyExchangeType dataValue;

    public final static String TESTA_EXC_SECURITY_EXCHANGE = "Frodo-Tag207ExcSecurityExchange";
    public final static String TESTB_EXC_SECURITY_EXCHANGE = "Gandalf-Tag207ExcSecurityExchange";

    public Tag207ExcSecurityExchange(MyExchangeType dataValue) {
        setFixType(FIX41.FIX207_EXC_SECURITY_EXCHANGE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(new MyExchangeType(TESTA_EXC_SECURITY_EXCHANGE) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag207ExcSecurityExchange(new MyExchangeType(TESTB_EXC_SECURITY_EXCHANGE) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}

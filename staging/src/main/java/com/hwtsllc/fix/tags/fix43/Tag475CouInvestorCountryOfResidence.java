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
import com.hwtsllc.fix.datatypes.MyCountryType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  475
 *  InvestorCountryOfResidence
 *  Country
 *  <p></p>
 *  The ISO 366 Country code (2 character) identifying which country the beneficial investor is resident for tax purposes.
 */
public class Tag475CouInvestorCountryOfResidence extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyCountryType dataValue;

    public final static String TESTA_COU_INVESTOR_COUNTRY_OF_RESIDENCE
            = "BilboBaggins-Tag475CouInvestorCountryOfResidence";
    public final static String TESTB_COU_INVESTOR_COUNTRY_OF_RESIDENCE
            = "Gandalf-Tag475CouInvestorCountryOfResidence";

    public Tag475CouInvestorCountryOfResidence(MyCountryType dataValue) {
        setFixType(FIX43.FIX475_COU_INVESTOR_COUNTRY_OF_RESIDENCE);
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
        Tag475CouInvestorCountryOfResidence tagData;

        tagData = new Tag475CouInvestorCountryOfResidence(new MyCountryType(TESTA_COU_INVESTOR_COUNTRY_OF_RESIDENCE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag475CouInvestorCountryOfResidence(new MyCountryType(TESTB_COU_INVESTOR_COUNTRY_OF_RESIDENCE) );
        System.out.println(tagData.toVerboseString());
    }
}

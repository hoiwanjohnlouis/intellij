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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumProduct;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  460 (same as 460, 462, 607,)
 *  Product
 *  int
 *  <p>
 *  Indicates the type of product the security is associated with.
 *  <p>
 *  See also the CFICode (461) and SecurityType (167)
 *  fields.
 *  <p></p>
 *  462
 *  UnderlyingProduct
 *  int
 *  <p>
 *  Underlying security’s Product.
 *  <p>
 *  See Product(460) field
 *  <p></p>
 *  607
 *  LegProduct
 *  int
 *  <p>
 *  Multileg instrument's individual  security’s Product.
 *  <p>
 *  See Product (460) field for description
 *  <p></p>
 *  Valid values:
 *  <p>     1 - AGENCY
 *  <p>     2 - COMMODITY
 *  <p>     3 - CORPORATE
 *  <p>     4 - CURRENCY
 *  <p>     5 - EQUITY
 *  <p></p>
 *  <p>     6 - GOVERNMENT
 *  <p>     7 - INDEX
 *  <p>     8 - LOAN
 *  <p>     9 - MONEYMARKET
 *  <p>     10 - MORTGAGE
 *  <p></p>
 *  <p>     11 - MUNICIPAL
 *  <p>     12 - OTHER
 *  <p>     13 - FINANCING
 */
public class Tag462EnuUnderlyingProduct extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final MyEnumProduct dataValue;

    public final static MyEnumProduct TESTA_ENU_UNDERLYING_PRODUCT
            = MyEnumProduct.CURRENCY;
    public final static MyEnumProduct TESTB_ENU_UNDERLYING_PRODUCT
            = MyEnumProduct.FINANCING;

    public Tag462EnuUnderlyingProduct(MyEnumProduct dataValue) {
        setFixType(FIX43.FIX462_ENU_UNDERLYING_PRODUCT);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
     * wrapper to return the description of the underlying ENUM data
     */
    @Override
    public String toEnumString() {
        return this.dataValue.getDescription();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag462EnuUnderlyingProduct tagData;

        tagData = new Tag462EnuUnderlyingProduct(TESTA_ENU_UNDERLYING_PRODUCT);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag462EnuUnderlyingProduct(TESTB_ENU_UNDERLYING_PRODUCT);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}

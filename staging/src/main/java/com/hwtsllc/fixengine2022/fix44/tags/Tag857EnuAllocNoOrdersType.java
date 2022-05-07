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
import com.hwtsllc.fixengine2022.fix44.enums.Enum857AllocNoOrdersType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  857
 *  AllocNoOrdersType
 *  int
 *  Indicates how the orders being booked and allocated by an Allocation Instruction or Allocation
 *  Report message are identified, i.e. by explicit definition in the NoOrders group or not.
 *  Valid values:
 *      0 - Not Specified
 *      1 - Explicit List Provided
 */
public class Tag857EnuAllocNoOrdersType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum857AllocNoOrdersType dataValue;

    public final static Enum857AllocNoOrdersType TESTA_ENU_ALLOC_NO_ORDERS_TYPE
            = Enum857AllocNoOrdersType.LIST_PROVIDED;
    public final static Enum857AllocNoOrdersType TESTB_ENU_ALLOC_NO_ORDERS_TYPE
            = Enum857AllocNoOrdersType.NOT_SPECIFIED;

    public Tag857EnuAllocNoOrdersType(Enum857AllocNoOrdersType dataValue) {
        setFixType(FIX44.FIX857_ENU_ALLOC_NO_ORDERS_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Tag857EnuAllocNoOrdersType tagData;

        tagData = new Tag857EnuAllocNoOrdersType(TESTA_ENU_ALLOC_NO_ORDERS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag857EnuAllocNoOrdersType(TESTB_ENU_ALLOC_NO_ORDERS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}

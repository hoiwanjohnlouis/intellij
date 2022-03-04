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

package com.hwtsllc.fixengine2022.datatypes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * QtyType is a wrapper class for the Qty field
 * Initially it will be a long.
 */
public class QtyType {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private long qty;

    public QtyType(final long qty) {
        this.qty = qty;
    }

    public long getQtyValue() {
        return qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getQtyValue());
        return sb.toString();
    }
    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        QtyType qtyType = new QtyType(12345L);
        System.out.println(qtyType);
    }
}

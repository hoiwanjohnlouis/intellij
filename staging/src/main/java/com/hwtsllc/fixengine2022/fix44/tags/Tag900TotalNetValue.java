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

/**
 *  900
 *  TotalNetValue
 *  Amt
 *  TotalNetValue is determined as follows:
 *      At the initial collateral assignment TotalNetValue is the sum of
 *      (UnderlyingStartValue * (1-haircut)).
 *      In a collateral substitution TotalNetValue is the sum of
 *      (UnderlyingCurrentValue * (1-haircut)).
 *      For listed derivatives clearing margin management,
 *      this is the collateral value which equals (Market value * haircut)
 */
public class Tag900TotalNetValue {
}

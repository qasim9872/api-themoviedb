/*
 *      Copyright (c) 2004-2016 Stuart Boston
 *
 *      This file is part of TheMovieDB API.
 *
 *      TheMovieDB API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      TheMovieDB API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with TheMovieDB API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.omertron.themoviedbapi.enumeration;

public enum Gender {
    MALE(1),
    FEMALE(2),
    UNKNOWN(0);

    private final int type;

    private Gender(int type) {
        this.type = type;
    }

    /**
     * Get the gender from an integer type
     *
     * @param iType
     * @return
     */
    public static Gender fromInteger(int iType) {
        switch (iType) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            default:
                return UNKNOWN;
        }
    }

}
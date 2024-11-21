package com.talisson.createUrlShortener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UrlData {
    public String originalUrl;
    private long expirationTime;
}

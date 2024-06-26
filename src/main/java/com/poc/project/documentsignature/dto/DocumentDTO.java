
package com.poc.project.documentsignature.dto;

import lombok.Data;

@Data
public class DocumentDTO {
    private String documentId;
    private Integer requestId;
    private String name;
    private String blobUrl;
    private String status;
}

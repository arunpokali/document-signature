
package com.poc.project.documentsignature.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Document {
    @Id
    @Column(name = "document_id", length = 255)
    private String documentId;

    @Column(name = "request_id")
    private Integer requestId;

    private String name;

    @Column(name = "blob_url", columnDefinition = "TEXT")
    private String blobUrl;

    private String status;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne
    @JoinColumn(name = "request_id", insertable = false, updatable = false)
    private SignatureRequest signatureRequest;
}

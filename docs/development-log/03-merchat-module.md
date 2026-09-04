# Development Log

# Merchant Entity

**Date:** 2026-09-03  
**Project:** Payroute

### Implemented

* Created `Merchant` JPA entity mapped to the `merchant` table.
* Added UUID-based primary key generation.
* Added merchant details, business information, KYC, and settlement bank fields.
* Added database constraints for required and unique fields.
* Created `MerchantStatus` enum:
    * `PENDING_KYC`
    * `ACTIVE`
    * `SUSPENDED`
* Created `BusinessType` enum for merchant business structures.
* Used `@Enumerated(EnumType.STRING)` for enum persistence.
* Added Lombok annotations for getters, setters, constructors, and builder pattern.
* Set new merchants to `PENDING_KYC` by default.

### Next

* Create `AppUser` Entity


package it.krzeminski.githubactionstyping.validation.types

import it.krzeminski.githubactionstyping.parsing.ApiItem
import it.krzeminski.githubactionstyping.validation.ItemValidationResult

fun ApiItem.validateFloat(): ItemValidationResult {
    if (this.allowedValues != null) {
        return ItemValidationResult.Invalid("'allowedValues' is not allowed for this type.")
    }
    if (this.separator != null) {
        return ItemValidationResult.Invalid("'separator' is not allowed for this type.")
    }

    return ItemValidationResult.Valid
}
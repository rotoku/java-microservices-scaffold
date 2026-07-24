terraform {
  required_providers {
    random = {
      source  = "hashicorp/random"
      version = "~> 3.6"
    }
  }
}

resource "random_string" "suffix" {
  length  = 8
  special = false
}

output "random_string_value" {
  value = random_string.suffix.result
}
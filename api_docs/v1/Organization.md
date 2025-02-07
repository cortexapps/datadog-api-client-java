# Organization

Create, edit, and manage organizations.

## Properties

| Name             | Type                                                        | Description                                                             | Notes                 |
| ---------------- | ----------------------------------------------------------- | ----------------------------------------------------------------------- | --------------------- |
| **billing**      | [**OrganizationBilling**](OrganizationBilling.md)           |                                                                         | [optional]            |
| **created**      | **String**                                                  | Date of the organization creation.                                      | [optional] [readonly] |
| **description**  | **String**                                                  | Description of the organization.                                        | [optional]            |
| **name**         | **String**                                                  | The name of the new child-organization, limited to 32 characters.       | [optional]            |
| **publicId**     | **String**                                                  | The &#x60;public_id&#x60; of the organization you are operating within. | [optional]            |
| **settings**     | [**OrganizationSettings**](OrganizationSettings.md)         |                                                                         | [optional]            |
| **subscription** | [**OrganizationSubscription**](OrganizationSubscription.md) |                                                                         | [optional]            |

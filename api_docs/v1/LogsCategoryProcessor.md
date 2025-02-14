# LogsCategoryProcessor

Use the Category Processor to add a new attribute (without spaces or special characters in the new attribute name) to a log matching a provided search query. Use categories to create groups for an analytical view. For example, URL groups, machine groups, environments, and response time buckets. **Notes**: - The syntax of the query is the one of Logs Explorer search bar. The query can be done on any log attribute or tag, whether it is a facet or not. Wildcards can also be used inside your query. - Once the log has matched one of the Processor queries, it stops. Make sure they are properly ordered in case a log could match several queries. - The names of the categories must be unique. - Once defined in the Category Processor, you can map categories to log status using the Log Status Remapper.

## Properties

| Name           | Type                                                                              | Description                                                                                                         | Notes      |
| -------------- | --------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ---------- |
| **categories** | [**List&lt;LogsCategoryProcessorCategory&gt;**](LogsCategoryProcessorCategory.md) | Array of filters to match or not a log and their corresponding &#x60;name&#x60;to assign a custom value to the log. |
| **isEnabled**  | **Boolean**                                                                       | Whether or not the processor is enabled.                                                                            | [optional] |
| **name**       | **String**                                                                        | Name of the processor.                                                                                              | [optional] |
| **target**     | **String**                                                                        | Name of the target attribute which value is defined by the matching category.                                       |
| **type**       | **LogsCategoryProcessorType**                                                     |                                                                                                                     |

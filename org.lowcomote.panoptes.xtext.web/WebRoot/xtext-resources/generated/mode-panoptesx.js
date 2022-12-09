define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Action|ActionExecution|BaseAlgorithm|BaseAlgorithmExecution|BaseAlgorithmRuntime|Boolean|Deployment|FeatureStore|HigherOrderAlgorithm|HigherOrderAlgorithmExecution|HigherOrderAlgorithmRuntime|Integer|Model|Real|String|Trigger|accepts|action|actions|algorithm|categorical|codebase|continuous|data|day|endpoint|entities|every|execute|execution|features|historic|hour|inputs|keys|labels|levels|live|mandatory|max|maximum|min|minimum|model|month|observations|observed|one|only|or|outputs|parameter|parameters|predictions|predicts|request|requires|runtime|samples|severity|uses|values|week|year";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[{]"},
				{token: "rparen", regex: "[}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/panoptesx";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});

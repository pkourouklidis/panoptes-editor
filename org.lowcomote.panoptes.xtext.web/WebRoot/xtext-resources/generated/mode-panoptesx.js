define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Action|ActionExecution|BaseAlgorithm|BaseAlgorithmExecution|BaseAlgorithmRuntime|Boolean|Deployment|Execute|FeatureStore|HigherOrderAlgorithm|HigherOrderAlgorithmExecution|HigherOrderAlgorithmRuntime|Integer|Model|Real|String|When|accepts|action|actions|algorithm|and|categorical|codebase|continuous|data|day|endpoint|entities|execution|false|features|from|historic|hour|inputs|keys|labels|levels|live|mandatory|max|maximum|min|minimum|model|month|observations|observed|one|only|or|outputs|parameter|parameters|passed|predictions|predicts|received|request|requires|runtime|samples|served|severity|true|use|uses|values|week|when|year";
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
